import java.util.Date;

public class SubscriptionRequest {
    private String token;
    private ContentType contentType;
    private String publisherIdentifier;
    private String requestBody;
    private Date startTime;
    private Date endTime;

    public SubscriptionRequest(String token, ContentType contentType, String publisherIdentifier, String requestBody, Date startTime, Date endTime) {
        this.token = token;
        this.contentType = contentType;
        this.publisherIdentifier = publisherIdentifier;
        this.requestBody = requestBody;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public ContentType getContentType() {
        return contentType;
    }

    public String getPublisherIdentifier() {
        return publisherIdentifier;
    }

    public String getRequestBody() {
        return requestBody;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public String getToken() {
        return token;
    }

}
