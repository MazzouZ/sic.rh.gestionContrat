package ma.sic.rh.gestionContrat.controllers;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import ma.sic.rh.gestionContrat.entities.Document;
import ma.sic.rh.gestionContrat.entities.DocumentType;
import ma.sic.rh.gestionContrat.repos.DocumentRepository;
import ma.sic.rh.gestionContrat.repos.DocumentTypeRepository;


@RestController
@CrossOrigin("*")
public class DocumentController {

	@Autowired
	private DocumentRepository documentRepository;
	
	@Autowired
	private DocumentTypeRepository documentTypeRepository;
	
	@PostMapping(path = "/documents/addDoc")
    public void chargerFichier(MultipartFile document,String documentType,String documentName,String observations) throws Exception {
		
        Document newDocument = new Document();
            
        try { 
        	newDocument.setDocumentType(documentTypeRepository.findByLabel(documentType));
        }catch(Exception e) {
        	System.out.println("*********************** Document Type not found !! *********************");

        }finally {
        	 newDocument.setDocumentName(documentName);
             newDocument.setCreationDate(new Date());
             newDocument.setObservations(observations);
             newDocument.setDocument(document.getOriginalFilename());
             Files.write(Paths.get(System.getProperty("user.home") + "/sic.gc/" + newDocument.getDocument()), document.getBytes());
                 
             documentRepository.save(newDocument);
        }
    }
	
	
	@GetMapping(path = "/documents/getDoc/{fileName}", produces = MediaType.ALL_VALUE)
    public byte[] getFile(@PathVariable("fileName") String fileName) throws Exception {
		
		Document document=new Document();
		
		try { 
			document = documentRepository.findByDocument(fileName);
			if(document==null)
				throw new FileNotFoundException();
			
		}catch(Exception e) {
			System.out.println("******************  Document not found ****************** \n"+e.getMessage());
			return null;
		}
		
		return Files.readAllBytes(Paths.get(System.getProperty("user.home") + "/sic.gc/" + document.getDocument()));	
		
    }

	@PostMapping(path = "/documents/editDoc")
    public void editFichier(MultipartFile document,String documentType,String documentName,String observations,Long id) throws Exception {
		
        if (id != null) {
			Document newDocument = documentRepository.findById(id).get();
	            
	        try { 
	        	if(documentType != null)
	        		newDocument.setDocumentType(documentTypeRepository.findByLabel(documentType));
	        }catch(Exception e) {
	        	System.out.println("*********************** Document Type not found !! *********************");
	        }finally {
	        	if(documentName != null)
	        		newDocument.setDocumentName(documentName);
	        	
	             if(observations != null)
	            	 newDocument.setObservations(observations);
	             if(document != null) {
	            	 newDocument.setDocument(document.getOriginalFilename());
	            	 Files.write(Paths.get(System.getProperty("user.home") + "/sic.gc/" + newDocument.getDocument()), document.getBytes());
	             }
	         
	             documentRepository.save(newDocument);
	             }
	        }
        else System.out.println("************** id not found !! ************");
    }
}
