/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Vivek
 */
public class StoreDirectory {
    
        private ArrayList<CVSStores> cvsstorelist;
    
public StoreDirectory(){

    this.cvsstorelist = new ArrayList<>();
}

public ArrayList<CVSStores> getstoreDir() {
        return cvsstorelist;
    }

    public void setstoreDir(ArrayList<CVSStores> storeDir) {
        this.cvsstorelist = storeDir;
    }
    
    public CVSStores addStores(){
    
        CVSStores Stores = new CVSStores();
        cvsstorelist.add(Stores);
        return Stores;
    }
    
    public void removedstore(CVSStores store){
            cvsstorelist.remove(store);
    }
    
    public CVSStores searchstore(String storename){
    
    for(CVSStores store : cvsstorelist)
        if (store.getStorename() == storename)
                return store;
    
    return null;
    }    




}
