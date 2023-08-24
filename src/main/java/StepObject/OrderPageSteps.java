package StepObject;

import PageObject.OrderPage;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static DataObject.OrderPageData.*;
import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Condition.visible;


public class OrderPageSteps extends OrderPage {
    @Step(" check whether we are really on the order page ")
    public OrderPageSteps GOtoOrderPage(){

        JuridicalEntity.shouldBe(visible, Duration.ofMillis(3000));
        PhysicalPerson.shouldBe(visible, Duration.ofMillis(3000));
        return this;
    }

    @Step(" click submit ")
    public OrderPageSteps SubmitOrder(){
        Submit_Btn.click();

        return this;
    }

    @Step(" fill company Name ")
    public OrderPageSteps CompanyNameCheck(String companyName){
        CompanyName.setValue(companyName);
        return this;
    }

    @Step(" fill identificationCode with text ")
    public OrderPageSteps IdentificationCodeTxtCheck(String identificationCode){
        IdentificationCode_Frame.setValue(identificationCode);
        IdentificationCode_Frame.shouldBe(empty, Duration.ofMillis(3000));
        return this;
    }

    @Step(" fill identificationCode with number ")
    public OrderPageSteps IdentificationCodeNumCheck(String identificationCode){
        IdentificationCode_Frame.setValue(identificationCode);
        BorderColor1.shouldNot(visible);
        return this;
    }

    @Step(" fill identificationCode with twelve number ")
    public OrderPageSteps IdentificationCodeNumCheck12(String identificationCode12){
        IdentificationCode_Frame.setValue(identificationCode12);
        BorderColor1.shouldNot(visible);
        Assert.assertEquals(IdentificationCode_Frame.setValue(IdentificationCodeNumbers12).getValue(), IdentificationCodeNumbers9, "It should be output: what was written");
        return this;
    }

    @Step(" fill identificationCode with nine number ")
    public OrderPageSteps IdentificationBorderColorCheck(String iidentificationCode){
        IdentificationCode_Frame.setValue(iidentificationCode);
        return this;
    }

    @Step(" fill actualAddress with Text ")
    public OrderPageSteps ActualAddressCheck(String actualAddressTxt){
        ActualAddress.setValue(actualAddressTxt);

        return this;
    }

    @Step(" fill mobileNumber with Text ")
    public OrderPageSteps MobileCheck(String mobileNumber){
        MobileNumber_Frame.setValue(mobileNumber);

        return this;
    }

    @Step(" fill mobileNumber with five number ")
    public OrderPageSteps MobileCheck5(String mobileNumberr){
        MobileNumber_Frame.setValue(mobileNumberr);

        return this;
    }

    @Step(" fill mobileNumber with twelve number ")
    public OrderPageSteps MobileCheck12(String mobileNumbers){
        MobileNumber_Frame.setValue(mobileNumbers);
        Assert.assertEquals(MobileNumber_Frame.setValue(mobileNumbers).getValue(), MobileNumberNum9, "It should be output: what was written");
        return this;
    }

    @Step(" fill mobileNumber with nine number ")
    public OrderPageSteps MobileCheck9(String mobilenumber){
        MobileNumber_Frame.setValue(mobilenumber);
        return this;
    }

    @Step(" fill ReceiveOrder Frame Less than what is allowed  ")
    public OrderPageSteps ReceiveOrderLessCheck(String receiveOrderLess){
        ReceiveOrder_Frame.setValue(receiveOrderLess);
        return this;
    }

    @Step(" fill ReceiveOrder Frame More than what is allowed  ")
    public OrderPageSteps ReceiveOrderMoreCheck(String receiveOrderMore){
        ReceiveOrder_Frame.setValue(receiveOrderMore);
        return this;
    }

    @Step(" fill Email with correct text  ")
    public OrderPageSteps EmailCorrectCheck(String emailCorrect){
        Email_Frame.setValue(emailCorrect);
        return this;
    }

    @Step(" fill Email with incorrect text  1 ")
    public OrderPageSteps EmailIncorrect1Check(String emailIncorrect){
        Email_Frame.setValue(emailIncorrect);
        return this;
    }

    @Step(" fill Email with incorrect text 2 ")
    public OrderPageSteps EmailIncorrect2Check(String emailIncorrectt){
        Email_Frame.setValue(emailIncorrectt);
        return this;
    }

    @Step(" fill Email with incorrect text  3 ")
    public OrderPageSteps EmailIncorrect3Check(String emailIncorrecttt){
        Email_Frame.setValue(emailIncorrecttt);
        return this;
    }

}
