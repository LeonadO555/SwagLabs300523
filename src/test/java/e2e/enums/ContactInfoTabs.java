package e2e.enums;

import lombok.Getter;

@Getter
public enum ContactInfoTabs {
    INFO("2"),
    CARD("3");
    public final String value;

    ContactInfoTabs(String value){
        this.value = value;
    }
}


