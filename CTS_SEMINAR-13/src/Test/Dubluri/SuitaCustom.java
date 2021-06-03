package Test.Dubluri;


import Test.Categori.ConstructorGrupa;
import Test.Categori.GetPromovabilitateCategory;
import Test.Categori.TesteUrgente;
import Test.GrupaTest;
import Test.GrupaTestFixture;
import Test.TestGrupaMock;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({TestGrupaMock.class, GrupaTest.class, GrupaTestFixture.class})
//@Categories.IncludeCategory(GetPromovabilitateCategory.class)
@Categories.ExcludeCategory({GetPromovabilitateCategory.class, ConstructorGrupa.class})
public class SuitaCustom {
}
