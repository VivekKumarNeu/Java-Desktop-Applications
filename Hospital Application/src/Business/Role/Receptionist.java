/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ReceptionistOrganization;
import Business.Organization.DonorOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.Reception.ReceptionostWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Vivek
 */
public class Receptionist extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ReceptionostWorkAreaJPanel(userProcessContainer, account, (ReceptionistOrganization)organization, enterprise);
        
    }
    
    
    
    
}
