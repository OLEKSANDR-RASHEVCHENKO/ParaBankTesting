package E2E.enums;

import lombok.Getter;
    @Getter
    public enum AccList {
        FIRST("[1]"),
        SECOND("[2]");

        public final String value;

        AccList(String value){
            this.value = value;
        }
    }

