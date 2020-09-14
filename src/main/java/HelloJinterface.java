import java.io.IOException;

import com.ericsson.otp.erlang.*;
public class HelloJinterface {

	public static void main(String[] args) throws IOException {
		OtpSelf self = new OtpSelf("client", "hejsan" ); 

		System.out.println("ok");
	}

}
