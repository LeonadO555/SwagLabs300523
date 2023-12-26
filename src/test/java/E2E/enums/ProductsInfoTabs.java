package E2E.enums;

import lombok.Getter;

@Getter
public enum ProductsInfoTabs {
    SAUCE_LABS_BACKPACK("add-to-cart-sauce-labs-backpack", "remove-sauce-labs-backpack"),
    SAUCE_LABS_BIKE_LIGHT("add-to-cart-sauce-labs-bike-light", "remove-sauce-labs-bike-light"),
    SAUCE_LABS_BOLT_T_SHIRT("add-to-cart-sauce-labs-bolt-t-shirt", "remove-sauce-labs-bolt-t-shirt"),
    SAUCE_LABS_FLEECE_JACKET("add-to-cart-sauce-labs-fleece-jacket", "remove-sauce-labs-fleece-jacket"),
    SAUCE_LABS_ONESIE("add-to-cart-sauce-labs-onesie", "remove-sauce-labs-onesie"),
    TEST_ALLTHETHINGS_T_SHIRT_RED("add-to-cart-test.allthethings()-t-shirt-(red)", "remove-test.allthethings()-t-shirt-(red)");

    private final String addToCartXPath;
    private final String removeFromCartXPath;

    ProductsInfoTabs(String addToCartXPath, String removeFromCartXPath) {
        this.addToCartXPath = "//*[@id='" + addToCartXPath + "']";
        this.removeFromCartXPath = "//*[@id='" + removeFromCartXPath + "']";
    }

    public String getAddToCartXPath() {
        return addToCartXPath;
    }

    public String getRemoveFromCartXPath() {
        return removeFromCartXPath;
    }
}
