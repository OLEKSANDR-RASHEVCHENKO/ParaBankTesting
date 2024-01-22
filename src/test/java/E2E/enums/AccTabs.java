package E2E.enums;

import lombok.Getter;

@Getter
public enum AccTabs {
FIRST("26442");

    public final String value;

    AccTabs(String value){
        this.value = value;
    }
}
