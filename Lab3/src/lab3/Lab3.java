/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;


public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ChannelData cd = new ChannelData("The Verge");
        ChannelData cd2 = new ChannelData("TED");
        
        NormalSub ns = new NormalSub("Ted" , cd);
        NormalSub ns2 = new NormalSub("Gabriel" , cd);
        
        GoldSub gs = new GoldSub("Jake" , cd2);
        GoldSub gs2 = new GoldSub("Emily" , cd2);
        
        cd.newVideoUpload();
        cd2.newVideoUpload();
    }
    
}
