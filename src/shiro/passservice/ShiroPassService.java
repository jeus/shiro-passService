/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiro.passservice;

import org.apache.shiro.authc.credential.DefaultPasswordService;
import org.apache.shiro.authc.credential.PasswordService;

/**
 *
 * @author jeus
 */
public class ShiroPassService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PasswordService passwordService = new DefaultPasswordService();
        String encryptedValue = passwordService.encryptPassword("12345");
        System.out.println(encryptedValue);
        String encryptedValue1 = passwordService.encryptPassword("123451");
        System.out.println(encryptedValue1);
        char[] chararray = "12345".toCharArray();
        if (passwordService.passwordsMatch(chararray, encryptedValue)) {
            System.out.println("PASSWORD IS MACH <++OK++>");
        } else {
            System.out.println("FAIL");
        }
        if (passwordService.passwordsMatch(chararray, encryptedValue1)) {
            System.out.println("PASSWORD IS MACH <++OK++>");
        } else {
            System.out.println("FAIL");
        }
        if (true) {
            return;
        }
    }
    
}
