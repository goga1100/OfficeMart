package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class OrderPage {


    public  SelenideElement
            BorderColor = $(byAttribute("style", "border: 1px solid red;"), 0),
            BorderColor1 = $(byAttribute("style", "border: 1px solid red;"), 1),
            BorderColor2 = $(byAttribute("style", "border: 1px solid red;"), 2),
            BorderColor3 = $(byAttribute("style", "border: 1px solid red;"), 3),
            BorderColor4 = $(byAttribute("style", "border: 1px solid red;"), 4),
            BorderColor5 = $(byAttribute("style", "border: 1px solid red;"), 5),
            Submit_Btn = $(byText("გაგზავნა")),
            CompanyName = $(byAttribute("placeholder", "კომპანიის სახელწოდება")),
            BorderColorNotRed = $(byAttribute("style", "border: 1px solid rgb(69, 69, 69);")),
            IdentificationCode_Frame = $(byAttribute("placeholder", "საიდენტიფიკაციო კოდი")),
            JuridicalEntity = $(byText("იურიდიული პირი")),
            PhysicalPerson = $(byText("ფიზიკური პირი")),
            ActualAddress = $(byAttribute("placeholder","ფაქტიური მისამართი")),
            MobileNumber_Frame = $(byAttribute("placeholder", "საკონტაქტო ნომერი")),
            ReceiveOrder_Frame = $(byAttribute("placeholder", "როდის გსურთ შეკვეთის მიღება?")),
            Email_Frame = $(byAttribute("placeholder", "ელ.ფოსტა"));


}
