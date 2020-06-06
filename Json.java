import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Json {
	private static ObjectMapper mapper = new ObjectMapper();
	/**
	 * Functional interface to build a JSON object
	 */
	public interface NewObject {
		ObjectNode build(ObjectNode object);
	}

	/**
	 * Create a new object
	 *
	 * @param objectNode lambda function for NewObject interface
	 * @return
	 */
	public static ObjectNode newObject(NewObject objectNode) {
		return objectNode.build(mapper.createObjectNode());
	}

	/**
	 * Functional interface to build a JSON array
	 */
	public interface NewArray {
		ArrayNode build(ArrayNode array);
	}

	/**
	 * Create a new array
	 *
	 * @param arrayNode lambda function for NewArray interface
	 * @return
	 */
	public static ArrayNode newArray(NewArray arrayNode) {
		return arrayNode.build(mapper.createArrayNode());
	}
}
