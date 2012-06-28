package com.mtt.api.test;

import com.mtt.api.test.exception.TestExecutionException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.impl.client.DefaultHttpClient;
import org.codehaus.jackson.node.JsonNodeFactory;
import org.codehaus.jackson.node.ObjectNode;

/**
 * Base class for a helper class for acting as a test HTTP client.
 */
public class BaseHttpClientTester {

     protected ObjectNode requestBody = new ObjectNode(JsonNodeFactory.instance);

     protected DefaultHttpClient client;

     protected HttpHost host;

    /**
     * Constuctor.
     * @param host the host
     * @param client the client
     */
     public BaseHttpClientTester(HttpHost host, DefaultHttpClient client) {
        this.host = host;
        this.client = client;
     }

    /**
     * Execute a request.
     * @param request the request
     * @return the response
     */
     protected final HttpResponse executeRequest(HttpRequest request) {
        try {
            return client.execute(host, request);
        } catch (Exception ex) {
            throw new TestExecutionException(ex);
        }
    }
}
