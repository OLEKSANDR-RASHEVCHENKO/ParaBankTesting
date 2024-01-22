package E2E.enums;

import lombok.Getter;
@Getter
public enum WhatTypeOfAccWouldYouLikeToOpen {

        CHECKING("[0]"),
        SAVINGS("[1]");

        public final String value;

        WhatTypeOfAccWouldYouLikeToOpen(String value){
            this.value = value;
        }
    }
