package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

        private WebDriver driver;

        public HomePage(WebDriver driver ){

            this.driver = driver;

        }

        public WebElement homeTextLabel (){

            return this.driver.findElement(By.xpath("//div[@class='page-body']/h1"));
            //WebElement homeTextLabel = this.driver.findElement(By.xpath("//div[@class='page-body']/h1"));
           //return homeTextLabel;

        }
        
        public WebElement homeUsername () {
            return this.driver.findElement(By.xpath("//div[@class='centered']//input[@name='username']"));
        }
        
        public WebElement homeText () {
            return this.driver.findElement(By.xpath("//div[@class='explanation']/p"));
        }
        
        public WebElement homePassword () {
            return this.driver.findElement(By.xpath("//div[@class='centered']//input[@name='password']"));
        }

        public WebElement homeTextAreaComment () {
            return this.driver.findElement(By.xpath("//div[@class='centered']//textarea[@name='comments']"));
        }
        
        public WebElement homeCheckboxItems () {
            return this.driver.findElement(By.xpath("//div[@class='centered']//input[@name='checkboxes[]' and @value='Checkbox A']"));
        
        }
        

        public WebElement homeRadioItems () {
            return this.driver.findElement(By.xpath("//div[@class='centered']//input[@name='radioval' and @value='Radio Item 1']"));
        }

        public WebElement homeMultipleSelectValues () {
            return this.driver.findElement(By.xpath("//div[@class='centered']//select[@name='multipleselect[]']//option[@value='Multiple Select Value B']"));
        }

        public WebElement homeDropdown () {
            return this.driver.findElement(By.xpath("//div[@class='centered']//select[@name='dropdown']//option[@value='Dropdown 2']"));
        }
        
        public WebElement clickSubmit () {
            return this.driver.findElement(By.xpath("//div[@class='centered']//input[@type='submit']"));
        }

		




}
