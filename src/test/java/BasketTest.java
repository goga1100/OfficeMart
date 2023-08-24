import StepObject.BasketPageSteps;
import StepObject.SearchPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.SearchPageData.Pen;
import static com.codeborne.selenide.Condition.*;


public class BasketTest extends ChromeRunner {
    SearchPageSteps searchPageSteps = new SearchPageSteps();
    BasketPageSteps basketPageSteps = new BasketPageSteps();

    @Test(priority = 4)
    @Description("4Case კონკრეტული პროდუქტის კალათაში დამატების ღილაკზე დაჭერით)")
    @Severity(SeverityLevel.NORMAL)
    public void CorrectSearch() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1();
        Assert.assertTrue(basketPageSteps.ProductIsInBasket.isDisplayed());

    }

    @Test(priority = 5)
    @Description("5Case პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს დამატებული პროდუქტის დასახელება)")
    @Severity(SeverityLevel.NORMAL)
    public void CheckProductName() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ProductNameCheck();

        Assert.assertTrue(basketPageSteps.FirstProduct.isDisplayed());

    }

    @Test(priority = 6)
    @Description("6Case პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს დამატებული პროდუქტის ფერი)")
    @Severity(SeverityLevel.NORMAL)
    public void CheckProductColor() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ProductColorCheck();

        Assert.assertTrue(basketPageSteps.ProductColor.isDisplayed());

    }

    @Test(priority = 7)
    @Description("7Case პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს დამატებული პროდუქტის კოდი)")
    @Severity(SeverityLevel.NORMAL)
    public void CheckProductCode() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ProductIdCheck();

        Assert.assertTrue(basketPageSteps.ProductId.isDisplayed());

    }

    @Test(priority = 8)
    @Description("8Case პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს დამატებული პროდუქტის რაოდენობა)")
    @Severity(SeverityLevel.NORMAL)
    public void CheckProductQuantity() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ProductQuantityCheck();

        Assert.assertTrue(basketPageSteps.ProductQuantity.isDisplayed());

    }

    @Test(priority = 9)
    @Description("9Case პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს დამატებული პროდუქტის ფასი)")
    @Severity(SeverityLevel.NORMAL)
    public void CheckProductPrice() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ProductPriceCheck();

        Assert.assertTrue(basketPageSteps.ProductPrice.isDisplayed());

    }

    @Test(priority = 10)
    @Description("10Case პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს დამატებული პროდუქტის ჯამი (სულ)")
    @Severity(SeverityLevel.NORMAL)
    public void CheckProductSum() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .ProductSumCheck();

        Assert.assertTrue(basketPageSteps.ProductSum.isDisplayed());

    }

    @Test(priority = 11)
    @Description("11Case თუ გავზრდით კალათაში არსებული პროუქტის რაოდენობას პროპორციულად უნდა გაიზარდოს " +
    "თითოეული ველის 'სულ' მნიშვნელობა, მაგ: თუ პროდუქტი ღირს 0.75 და რაოდენობა გავხადეთ 2. 'სულ' ველში უნდა ჩანდეს 1.5")
    @Severity(SeverityLevel.NORMAL)
    public void IncreaseProductQuantity() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .BasketCountPlus();

    }

    @Test(priority = 12)
    @Description("12Case თუ შევამცირებთ კალათაში არსებული პროუქტის რაოდენობას პროპორციულად უნდა შემცირდეს თითოეული " +
    "ველის 'სულ' მნიშვნელობა, მაგ: თუ პროდუქტი ღირს 0.75 და არჩეული გვაქს რაოდენობა 2 შემცირების ღილაკზე დაჭერის შემდეგ უნდა გამოიტანოს 0.75")
    @Severity(SeverityLevel.NORMAL)
    public void DecreaseProductQuantity() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .BasketCountMinus();

    }

    @Test(priority = 13)
    @Description("13Case შესაძლებელი უნდა იყოს კალათაში არსებული კონკრეტული პროდუქტის წაშლა, X ღილაკზე დაჭერით, პროდუქტი ქრება კალათიდან")
    @Severity(SeverityLevel.NORMAL)
    public void DeletingProductFromBasket() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1()
                .DeleteProduct();
        Assert.assertTrue(basketPageSteps.BasketISEmpty_Txt.isDisplayed());

    }

    @Test(priority = 14)
    @Description("14Case თუ რამდენიმე პროდუქტი გვაქვს კალათაში დამატებული შესაძლებელი უნდა იყოს მთლიანი კალათის გასუფთავება" +
            "კალათის გასუფთავება ღილაკზე დაჭერით ყველა პროდუქტი ქრება კალათიდან")
    @Severity(SeverityLevel.NORMAL)
    public void ClearAllProductFromBasket() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1();
        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket2()
                .ClearProduct();

        Assert.assertFalse(basketPageSteps.ProductPrice.is(Condition.visible));

    }

    @Test(priority = 15)
    @Description("15Case თუ რამდენიმე პროდუქტი გვაქვს კალათაში დამატებული შესაძლებელი უნდა იყოს მთლიანი კალათის გასუფთავება" +
            "კალათის გასუფთავება ღილაკზე დაჭერით გამოდის ტექსტი კალათა ცარიელია")
    @Severity(SeverityLevel.NORMAL)
    public void ClearAllProductFromBasket2() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1();
        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket2()
                .ClearProduct();

        Assert.assertTrue(basketPageSteps.BasketISEmpty_Txt.isDisplayed());

    }

    @Test(priority = 16)
    @Description("16Case თუ რამდენიმე პროდუქტი გვაქვს კალათაში დამატებული შესაძლებელი უნდა იყოს მთლიანი კალათის გასუფთავება" +
            "კალათის გასუფთავება ღილაკზე დაჭერით უნდა გაქრეს ღილაკი გაგრძელება")
    @Severity(SeverityLevel.NORMAL)
    public void ClearAllProductFromBasket3() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1();
        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket2()
                .ClearProduct();

        Assert.assertFalse(basketPageSteps.Continue_Btn.is(visible));

    }

    @Test(priority = 17)
    @Description("17Case თუ რამდენიმე პროდუქტი გვაქვს კალათაში დამატებული შესაძლებელი უნდა იყოს მთლიანი კალათის გასუფთავება" +
            "კალათის გასუფთავება ღილაკზე დაჭერით უნდა გაქრეს ღილაკი კალათის გასუფთავება")
    @Severity(SeverityLevel.NORMAL)
    public void ClearAllProductFromBasket4() {

        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket1();
        searchPageSteps
                .SearchBtn()
                .SearchData(Pen);
        basketPageSteps
                .AddInBasket2()
                .ClearProduct();

        Assert.assertFalse(basketPageSteps.ClearBasket_Btn.is(visible));

    }





}
