import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ShoppingCartTest {

    AsosHomePage asosHomePage;
    ProductPage productPage;
    ShoppingCartPage shoppingCartPage;

    @Before
    public void setUp() {
        asosHomePage = new AsosHomePage();
    }

    @Test
    public void testItemAddedIsInCart() {
        productPage = asosHomePage.searchFor("Fjallraven Ovik Messenger Bag");
        shoppingCartPage = productPage.addProductToCart().goToCart();

        String actualProductName = shoppingCartPage.getProductName();

        assertEquals("Fjallraven Ovik Messenger Bag", actualProductName);
    }

    @After
    public void tearDown() {
        shoppingCartPage.close();
    }

}
