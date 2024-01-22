package E2E.enums;

import lombok.Getter;

@Getter
public enum ChooseAnExistingAccToTransferIntoNewAcc {
    ACC_ONE("[0]"),
    ACC_TWO("[1]");

    public final String value;

    ChooseAnExistingAccToTransferIntoNewAcc(String value){
        this.value = value;
    }
}
