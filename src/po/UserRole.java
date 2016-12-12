package po;

public class UserRole {
    private String id;

    private String txUserId;

    private String txRoleId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTxUserId() {
        return txUserId;
    }

    public void setTxUserId(String txUserId) {
        this.txUserId = txUserId == null ? null : txUserId.trim();
    }

    public String getTxRoleId() {
        return txRoleId;
    }

    public void setTxRoleId(String txRoleId) {
        this.txRoleId = txRoleId == null ? null : txRoleId.trim();
    }
}