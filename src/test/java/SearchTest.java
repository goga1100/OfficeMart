import StepObject.SearchPageSteps;
import Utils.ChromeRunner;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.*;

import static DataObject.SearchPageData.*;


public class SearchTest extends ChromeRunner {

    SearchPageSteps searchPageSteps = new SearchPageSteps();

    @Test(priority = 1)
    @Description("1Case საძიებო ღილაკზე დაკლიკებით უნდა გამოვიდეს ჩასაწერი ველი")
    @Severity(SeverityLevel.NORMAL)
    public void SearchCheck() {

        searchPageSteps.SearchBtn();
        Assert.assertTrue(searchPageSteps.SearchField.isDisplayed());

    }


    @Test(priority = 2)
    @Description("2Case საძიებო ველში სწორი მონაცემებით ძებნა (მაგ: კალამი ბურთულიანი)")
    @Severity(SeverityLevel.NORMAL)
    public void CorrectSearch() {

    searchPageSteps
            .SearchBtn()
            .SearchData(Pen)
            .DataNameIncludes(Pen);


    }

    // Negative Case
    @Test(priority = 3)
    @Description("3Case საძიებო ველში არასწორი მონაცემებით ძებნა (მაგ: satesto)")
    @Severity(SeverityLevel.NORMAL)
    public void IncorrectSearch() {

        searchPageSteps
                .SearchBtn()
                .SearchData(IncorrectData);
        Assert.assertTrue(searchPageSteps.DataNotFound.isDisplayed());

    }


}
