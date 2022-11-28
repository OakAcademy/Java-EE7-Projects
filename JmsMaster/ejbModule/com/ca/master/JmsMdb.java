package com.ca.master;

import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Queue;

/**
 * Message-Driven Bean implementation class for: JmsMdb
 */
@MessageDriven(
		activationConfig = { @ActivationConfigProperty(
				propertyName = "destination", propertyValue = "Queue01"), @ActivationConfigProperty(
				propertyName = "destinationType", propertyValue = "javax.jms.Queue")
		}, 
		mappedName = "Queue01")
public class JmsMdb implements MessageListener {

	@Inject JMSContext jmsContext;
	@Resource(mappedName="Queue02") Queue queue02;
	
	/**
     * @see MessageListener#onMessage(Message)
     */
    public void onMessage(Message message) {
        // TODO Auto-generated method stub
        
    	try{
    		String stringMessage = message.getBody(String.class);
    		System.out.println("EchoMDB received that following message : "+stringMessage);
    		jmsContext.createProducer().send(queue02," echo "+stringMessage);
    		
    	} catch (JMSException e) {
			// TODO: handle exception
    		e.printStackTrace();
		}
    }

}
