package Functions;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.Collections;
import static jdk.nashorn.tools.ShellFunctions.input;

public class ReadInitialFile {

public void main(String args[]){
    
        try {

	File fXmlFile = new File("C:\\Users\\Vivek\\Documents\\NetBeansProjects\\Assignment4\\src\\Functions\\data.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(fXmlFile);
			
	doc.getDocumentElement().normalize();
        String addition;
        NodeList nList = doc.getElementsByTagName("drug");
	for (int temp = 0; temp < nList.getLength(); temp++) {

		Node nNode = nList.item(temp);
				
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {

			Element eElement = (Element) nNode;

			System.out.println("Drug name : " + eElement.getAttribute("id"));
			System.out.println("First Name : " + eElement.getElementsByTagName("quantity").item(0).getTextContent());
			System.out.println("Last Name : " + eElement.getElementsByTagName("expiryyear").item(0).getTextContent());
			System.out.println("Nick Name : " + eElement.getElementsByTagName("price").item(0).getTextContent());
		}
	}
    } catch (Exception e) {
	e.printStackTrace();
    }

    
} 
}