package chain;

import java.security.PublicKey;

public class TransactionOutput {

    public String id;
    public PublicKey recipient;
    public float value; //the amount of coins
    public String parentTransactionId;



    public TransactionOutput(PublicKey reciepient, float value, String parentTransactionId) {
        this.recipient = reciepient;
        this.value = value;
        this.parentTransactionId = parentTransactionId;
        this.id = StringUtil.applySha256(StringUtil.getStringFromKey(reciepient)+Float.toString(value)+parentTransactionId);

    }


    public boolean isMine(PublicKey publicKey) {
        return (publicKey == recipient);
    }

}
