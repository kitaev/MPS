
package jetbrains.mps.plugin;

import org.apache.xmlrpc.XmlRpcClient;
import org.apache.xmlrpc.XmlRpcException;

import java.net.MalformedURLException;
import java.util.Vector;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

/**
 * @author Kostik
 */
public class MPSPlugin {
  private static MPSPlugin ourInstance;

  public static MPSPlugin getInstance() {
    if (ourInstance == null) {
      ourInstance = new MPSPlugin();
    }
    return ourInstance;
  }

  public static final int PORT = 23239;

  private XmlRpcClient myClient;

  private MPSPlugin() {
    try {
      myClient = new XmlRpcClient("localhost", PORT);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
  }

  public List<String> getAspectMethodIds(String namespace, String  prefix) throws IOException, XmlRpcException {
    Vector<String> params = new Vector<String>();
    params.add(namespace);
    params.add(prefix);

    String resultString = (String) myClient.execute("MPSSupport.getAspectMethodIds", params);

    List<String> result = new ArrayList<String>();
    String[] strings = resultString.split(";");
    for (int i = 0; i < strings.length; i++) {
      result.add(strings[i]);
    }
    return result;
  }


  public void createAspectMethod(String namespace, String name, String returnType, String parms) throws IOException, XmlRpcException {
    Vector<String> params = new Vector<String>();
    params.add(namespace);
    params.add(name);
    params.add(returnType);
    params.add(parms);
    myClient.execute("MPSSupport.createAspectMethod", params);
  }

  public static void main(String[] args) throws Exception {
    MPSPlugin client = new MPSPlugin();
    client.createAspectMethod("jetbrains.mps.rulez", "test_something", "void", "int i");
  }
}
