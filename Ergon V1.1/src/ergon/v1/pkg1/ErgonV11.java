/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ergon.v1.pkg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author renan.moura
 */
public class ErgonV11 {

    WebDriver driver = new FirefoxDriver();
    
  
    public void abrir (){
        
        driver.get("https://www.google.com.br");
    }
    
}
