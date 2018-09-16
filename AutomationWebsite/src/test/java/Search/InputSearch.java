package Search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InputSearch extends CommonAPI {



    @Test
    public void search (){
        WebElement element = driver.findElement(By.id("search_block_top"));
       element.sendKeys("Women Shirt", Keys.ENTER);

  }


}
