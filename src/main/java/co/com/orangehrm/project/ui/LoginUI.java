package co.com.orangehrm.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI extends PageObject {



        public static final Target INPUT_USER_NAME = Target.the("ingresa el nombre de usuario")
                .located(By.xpath("//input[@name='username']"));

        public static final Target INPUT_PASSWORD = Target.the("ingresa la contraseña")
                .located(By.xpath("//input[@name='password']")
                );

        public static final Target BUTTON_LOGIN = Target.the("pulsa el botón para iniciar sesión")
                .located(By.xpath("//button[@type='submit']"));

        public static final Target DASHBOARD_TITLE = Target.the("Dashboard title")
                .located(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));

}
