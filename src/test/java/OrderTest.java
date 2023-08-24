import StepObject.BasketPageSteps;
import StepObject.OrderPageSteps;
import StepObject.SearchPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.OrderPageData.*;
import static DataObject.SearchPageData.Pen;
import static com.codeborne.selenide.Condition.*;

public class OrderTest extends ChromeRunner {

    SearchPageSteps searchPageSteps = new SearchPageSteps();
    BasketPageSteps basketPageSteps = new BasketPageSteps();
    OrderPageSteps orderPageSteps = new OrderPageSteps();


    @Test(priority = 18)
    @Description("18Case კალათაში პროდუქტის დამატების შემდეგ გაგრძელება ღილაკზე დაჭერით უნდა გამოვიდეს" +
            " ორი ფორმა იურიდიული პირები და ფიზიკური პირები")
    @Severity(SeverityLevel.NORMAL)
    public void CheckContinuousBtn() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ContinuousBtnCheck();
        orderPageSteps
                .GOtoOrderPage();
        Assert.assertTrue(orderPageSteps.JuridicalEntity.isDisplayed());
        Assert.assertTrue(orderPageSteps.PhysicalPerson.isDisplayed());

    }

    @Test(priority = 19)
    @Description("19Case იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკების შემთხვევაში" +
                 "უნდა გაწითლდეს ველი კომპანიის სახელწოდება")
    @Severity(SeverityLevel.NORMAL)
    public void CompanyNameFrameBorder() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ContinuousBtnCheck();
        orderPageSteps
                .GOtoOrderPage()
                .SubmitOrder();
        Assert.assertTrue(orderPageSteps.BorderColor.isDisplayed());


    }

    @Test(priority = 20)
    @Description("20Case იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკების შემთხვევაში" +
            "უნდა გაწითლდეს ველი საიდენტიფიკაციო კოდი")
    @Severity(SeverityLevel.NORMAL)
    public void IdentificationCodeFrameBorder() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ContinuousBtnCheck();
        orderPageSteps
                .GOtoOrderPage()
                .SubmitOrder();
        Assert.assertTrue(orderPageSteps.BorderColor1.isDisplayed());


    }

    @Test(priority = 21)
    @Description("21Case იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკების შემთხვევაში" +
            "უნდა გაწითლდეს ველი ფაქტიური მისამართი")
    @Severity(SeverityLevel.NORMAL)
    public void ActualAddressFrameBorder() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ContinuousBtnCheck();
        orderPageSteps
                .GOtoOrderPage()
                .SubmitOrder();
        Assert.assertTrue(orderPageSteps.BorderColor2.isDisplayed());


    }

    @Test(priority = 22)
    @Description("22Case იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკების შემთხვევაში" +
            "უნდა გაწითლდეს ველი საკონტაქტო ნომერი")
    @Severity(SeverityLevel.NORMAL)
    public void ContactNumberFrameBorder() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ContinuousBtnCheck();
        orderPageSteps
                .GOtoOrderPage()
                .SubmitOrder();
        Assert.assertTrue(orderPageSteps.BorderColor3.isDisplayed());


    }

    @Test(priority = 23)
    @Description("23Case იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკების შემთხვევაში" +
            "უნდა გაწითლდეს ველი როდის გსურთ შეკვეთის მიღება")
    @Severity(SeverityLevel.NORMAL)
    public void ReceiveYourOrderFrameBorder() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ContinuousBtnCheck();
        orderPageSteps
                .GOtoOrderPage()
                .SubmitOrder();
        Assert.assertTrue(orderPageSteps.BorderColor4.isDisplayed());


    }

    @Test(priority = 24)
    @Description("24Case იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკების შემთხვევაში" +
            "უნდა გაწითლდეს ველი ელ.ფოსტა")
    @Severity(SeverityLevel.NORMAL)
    public void EmailFrameBorder() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ContinuousBtnCheck();
        orderPageSteps
                .GOtoOrderPage()
                .SubmitOrder();
        Assert.assertTrue(orderPageSteps.BorderColor5.isDisplayed());


    }

    @Test(priority = 25)
    @Description("25Case იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი კომპანიის სახელწოდება წითლდება ." +
            " თუ ველში ჩავწერთ ნებისმიერ მნიშვნელობას და კვლავ დავაკლიკებთ გაგზავნა ღილაკს: ველი აღარ უნდა იყოს წითელი")
    @Severity(SeverityLevel.NORMAL)
    public void CheckCompanyName() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ContinuousBtnCheck();
        orderPageSteps
                .GOtoOrderPage()
                .SubmitOrder();
                Assert.assertTrue(orderPageSteps.BorderColor.is(Condition.visible));
        orderPageSteps
                .CompanyNameCheck(CompanyName)
                .SubmitOrder();
        Assert.assertTrue(orderPageSteps.BorderColorNotRed.is(visible));



    }

    @Test(priority = 26)
    @Description("26Case იურიდიული პირის ფორმაზე ველში საიდენტიფიკაციო კოდი ტექსტური ტიპის მონაცემის შეყვანისას" +
                 "არ უნდა ჩაიწეროს ველში მნიშვნელობა")
    @Severity(SeverityLevel.NORMAL)
    public void CheckIdentificationCodeTxt() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ContinuousBtnCheck();
        orderPageSteps
                .GOtoOrderPage()
                .SubmitOrder();
        Assert.assertTrue(orderPageSteps.BorderColor.is(Condition.visible));
        orderPageSteps
                .IdentificationCodeTxtCheck(IdentificationCodeText);
        Assert.assertTrue(orderPageSteps.IdentificationCode_Frame.isDisplayed());

    }

    @Test(priority = 27)
    @Description("27Case იურიდიული პირის ფორმაზე ველში საიდენტიფიკაციო კოდი თუ შევიყვანთ 11 სიმბოლოზე ნაკლებ რიცხვით მნიშვნელობას" +
            " და დავაჭერთ გაგზავნა ღილაკს უნდა გაწითლდეს ველი საიდენტიფიკაციო კოდი")
    @Severity(SeverityLevel.NORMAL)
    public void CheckIdentificationCodeNum() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ContinuousBtnCheck();
        orderPageSteps
                .GOtoOrderPage();
        orderPageSteps
                .IdentificationCodeNumCheck(IdentificationCodeNumbers)
                .SubmitOrder();
        Assert.assertTrue(orderPageSteps.BorderColor1.isDisplayed());

    }

    @Test(priority = 28)
    @Description("28Case იურიდიული პირის ფორმაზე ველში საიდენტიფიკაციო კოდი თუ შევიყვანთ მაგ 12 სიმბოლს" +
                 "ველში მაინც უნდა ჩაიწეროს 11 სიმბოლო")
    @Severity(SeverityLevel.NORMAL)
    public void CheckIdentificationCodeNum12() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ContinuousBtnCheck();
        orderPageSteps
                .GOtoOrderPage();
        orderPageSteps
                .IdentificationCodeNumCheck12(IdentificationCodeNumbers12);

    }

    @Test(priority = 29)
    @Description("29Case იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი საიდენტიფიკაციო კოდი  წითლდება ." +
    " თუ ველში ჩავწერთ რიცხვით მნიშვნელობას(დასაშვებია მხოლოდ 11 სიმბოლო) და კვლავ დავაკლიკებთ გაგზავნა ღილაკს ველი აღარ უნდა იყოს წითელი")
    @Severity(SeverityLevel.NORMAL)
    public void CheckIdentificationCodBorderColor() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ContinuousBtnCheck();
        orderPageSteps
                .GOtoOrderPage()
                .SubmitOrder();
        orderPageSteps
                .IdentificationBorderColorCheck(IdentificationCodeNumbers9)
                .SubmitOrder();
        Assert.assertTrue(orderPageSteps.BorderColorNotRed.is(Condition.visible));

    }

    @Test(priority = 30)
    @Description("30Case იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი ფაქტიური მისამართი წითლდება" +
            " . თუ ველში ჩავწერთ ნებისმიერ მნიშვნელობას და კვლავ დავაკლიკებთ გაგზავნა ღილაკს ველი აღარ უნდა იყოს წითელი")
    @Severity(SeverityLevel.NORMAL)
    public void CheckActualAddress() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ContinuousBtnCheck();
        orderPageSteps
                .GOtoOrderPage()
                .SubmitOrder();
        orderPageSteps
                .ActualAddressCheck(ActualAddressTxt)
                .SubmitOrder();
        Assert.assertTrue(orderPageSteps.BorderColorNotRed.is(Condition.visible));

    }

    @Test(priority = 31)
    @Description("31Case იურიდიული პირის ფორმაზე ველში საკონტაქტო ნომერი ტექტსური ტიპის მონაცემის შეყვანისას" +
                 "არ უნდა ჩაიწეროს ველში მნიშვნელობა")
    @Severity(SeverityLevel.NORMAL)
    public void CheckMobileNumber() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ContinuousBtnCheck();
        orderPageSteps
                .GOtoOrderPage();
        orderPageSteps
                .MobileCheck(MobileNumberText)
                .SubmitOrder();
        Assert.assertTrue(orderPageSteps.MobileNumber_Frame.is(empty));

    }

    @Test(priority = 32)
    @Description("32Case იურიდიული პირის ფორმაზე ველში საკონტაქტო ნომერი თუ შევიყვანთ 9 სიმბოლოზეზე ნაკლებ რიცხვით" +
                 " მნიშნელობას და დავაჭერთ გაგზავნა ღილაკს უნდა გაწითლდეს ველი საკონტაქტო ნომერი")
    @Severity(SeverityLevel.NORMAL)
    public void CheckMobileNumberFiveNum() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ContinuousBtnCheck();
        orderPageSteps
                .GOtoOrderPage();
        orderPageSteps
                .MobileCheck5(MobileNumberNum5)
                .SubmitOrder();
        Assert.assertTrue(orderPageSteps.BorderColor3.is(Condition.visible));

    }

    @Test(priority = 33)
    @Description("33Case იურიდიული პირის ფორმაზე ველში საკონტაქტო ნომერი თუ შევიყვანთ მაგ 12 სიმბოლს" +
                 "ველში მაინც უნდა ჩაიწეროს 9 სიმბოლო")
    @Severity(SeverityLevel.NORMAL)
    public void CheckMobileNumberTwelveNum() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ContinuousBtnCheck();
        orderPageSteps
                .GOtoOrderPage();
        orderPageSteps
                .MobileCheck12(MobileNumberNum12);

    }

    @Test(priority = 34)
    @Description("34Case იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი საკონტაქტო ნომერი წითლდება თუ" +
            " ველში ჩავწერთ 9 სიმბოლოიან რიცხვით მნიშვნელობას და კვლავ დავაჭერთ გაგზავნა ღილაკს ველი აღარ უნდა იყოს წითელი")
    @Severity(SeverityLevel.NORMAL)
    public void CheckMobileNumberNineNum() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ContinuousBtnCheck();
        orderPageSteps
                .GOtoOrderPage()
                .SubmitOrder();
        orderPageSteps
                .MobileCheck9(MobileNumberNum9)
                .SubmitOrder();
        Assert.assertTrue(orderPageSteps.BorderColorNotRed.is(Condition.visible));

    }

    @Test(priority = 35)
    @Description("35Case იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი როდის გსურთ შეკვეთის მიღება?" +
            " წითლდება თუ ჩავწერთ ნებისმიერ მნიშვნელობას რომელიც 5 სიმბოლოზე ნაკლებია ველი როდის გსურთ შეკვეთის მიღება? უნდა დარჩეს წითელი")
    @Severity(SeverityLevel.NORMAL)
    public void CheckReceiveOrderLess() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ContinuousBtnCheck();
        orderPageSteps
                .GOtoOrderPage()
                .SubmitOrder();
        orderPageSteps
                .ReceiveOrderLessCheck(ReceiveOrderLessTxt)
                .SubmitOrder();
        Assert.assertTrue(orderPageSteps.BorderColor4.is(Condition.visible));

    }

    @Test(priority = 36)
    @Description("36Case იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი როდის გსურთ შეკვეთის მიღება?" +
                 " წითლდება თუ ჩავწერთ ნებისმიერ მნიშვნელობას რომელიც 5 სიმბოლოზე მეტია ველი აღარ უნდა იყოს წითელი")
    @Severity(SeverityLevel.NORMAL)
    public void CheckReceiveOrderMore() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ContinuousBtnCheck();
        orderPageSteps
                .GOtoOrderPage()
                .SubmitOrder();
        orderPageSteps
                .ReceiveOrderMoreCheck(ReceiveOrderMoreTxt)
                .SubmitOrder();
        Assert.assertTrue(orderPageSteps.BorderColorNotRed.is(Condition.visible));

    }

    @Test(priority = 37)
    @Description("37Case იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი ელ.ფოსტა წითლდება თუ" +
                 " ჩავწერთ მეილისთვის დასაშვებ ფორმატში მნიშვნელობას test@gmail.com მაგალითად ველი აღარ უნდა იყოს წითელი")
    @Severity(SeverityLevel.NORMAL)
    public void CheckEmailPositive() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ContinuousBtnCheck();
        orderPageSteps
                .GOtoOrderPage()
                .SubmitOrder();
        orderPageSteps
                .EmailCorrectCheck(Email)
                .SubmitOrder();
        Assert.assertTrue(orderPageSteps.BorderColorNotRed.is(Condition.visible));

    }


    //Here is bug;
    @Test(priority = 38)
    @Description("38Case იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი ელ.ფოსტა" +
                 " წითლდება თუ ჩავწერთ მეილისთვის დაუშვებელ ფორმატს test.gmail.com ველი აღარ უნდა იყოს წითელი")
    @Severity(SeverityLevel.NORMAL)
    public void CheckEmailNegative1() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ContinuousBtnCheck();
        orderPageSteps
                .GOtoOrderPage()
                .SubmitOrder();
        orderPageSteps
                .EmailIncorrect1Check(EmailIncorrect1)
                .SubmitOrder();
            Assert.assertTrue(orderPageSteps.BorderColor5.is(Condition.visible));



    }

    //Here is bug;
    @Test(priority = 39)
    @Description("39Case იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი ელ.ფოსტა წითლდება" +
                 " თუ ჩავწერთ მეილისთვის დაუშვებელ ფორმატს test@gmail ველი ელ.ფოსტა უნდა დარჩეს წითელი")
    @Severity(SeverityLevel.NORMAL)
    public void CheckEmailNegative2() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ContinuousBtnCheck();
        orderPageSteps
                .GOtoOrderPage()
                .SubmitOrder();
        orderPageSteps
                .EmailIncorrect2Check(EmailIncorrect2)
                .SubmitOrder();
        Assert.assertTrue(orderPageSteps.BorderColor5.is(Condition.visible));



    }

    @Test(priority = 40)
    @Description("40Case იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი ელ.ფოსტა წითლდება თუ" +
                 " ჩავწერთ მეილისთვის დაუშვებელ ფორმატს test.gmail@ ველი ელ.ფოსტა უნდა დარჩეს წითელი")
    @Severity(SeverityLevel.NORMAL)
    public void CheckEmailNegative3() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ContinuousBtnCheck();
        orderPageSteps
                .GOtoOrderPage()
                .SubmitOrder();
        orderPageSteps
                .EmailIncorrect3Check(EmailIncorrect3)
                .SubmitOrder();
        Assert.assertTrue(orderPageSteps.BorderColor5.is(Condition.visible));



    }



}
