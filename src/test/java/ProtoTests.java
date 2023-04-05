import com.asy.tests.grpc.proto.user.CreateUserRequest;
import com.asy.tests.grpc.proto.user.UserType;
import com.google.protobuf.Timestamp;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProtoTests {

    @Test
    public  void testCreateUser() {
        int id = new Random().nextInt();
        String email = "test@asymail.github";
        String name = "User Name";
        String number1 = "+905555555555";
        String number2 = "+905555555556";

        CreateUserRequest createUserRequest = CreateUserRequest.newBuilder()
                .setId(id)
                .setName(name)
                .setEmail(email)
                .setType(UserType.VIP)
                .setBirthdate(Timestamp.newBuilder().setNanos(0).setSeconds(3454354L).build())
                .addNumbers(number1)
                .addNumbers(number2)
                .build();

        assertEquals(createUserRequest.getEmail(), email);
        assertEquals(createUserRequest.getId(), id);
        assertEquals(createUserRequest.getName(), name);
        assertEquals(createUserRequest.getNumbers(0), number1);

    }

    @Test
    public void serializeProto() throws IOException {
        CreateUserRequest request = CreateUserRequest.newBuilder().setId(1).setName("name").setEmail("mail@asymail.github").addNumbers("+905555555555").build();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        request.writeTo(bos);

        CreateUserRequest userRequestDeserialized = CreateUserRequest.newBuilder().mergeFrom(bos.toByteArray()).build();
        assertEquals(request, userRequestDeserialized);
    }


}
