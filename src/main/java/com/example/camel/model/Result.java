package com.example.camel.model;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonProperty;
public class Result{
	
	@XmlElement(name="Status")
	@JsonProperty("Status")
    private String Status;
	
	@XmlElement(name="Message")
	@JsonProperty("Message")
	private String Message;
	
	@XmlElement(name="MessageId")
	@JsonProperty("MessageId")
	private Integer MessageId;

    public String getStatus ()
    {
        return Status;
    }

    public void setStatus (String Status)
    {
        this.Status = Status;
    }

    @Override
    public String toString()
    {
        return "[Status = "+Status+"]";
    }

	/**
	 * @return the message
	 */
	public String getMessage() {
		return Message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		Message = message;
	}

	/**
	 * @return the messageId
	 */
	public Integer getMessageId() {
		return MessageId;
	}

	/**
	 * @param messageId the messageId to set
	 */
	public void setMessageId(Integer messageId) {
		MessageId = messageId;
	}
    
}
		
