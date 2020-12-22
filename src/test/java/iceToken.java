import com.github.dzieciou.testing.curl.CurlLogger;
import com.github.dzieciou.testing.curl.CurlRestAssuredConfigFactory;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.LogConfig;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

import net.minidev.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import javax.sql.DataSource;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Properties;

import static com.jayway.restassured.RestAssured.*;
import static java.lang.System.out;
import static java.lang.System.setOut;

public class iceToken {
    @Before
    public void setup() {
        RestAssured.config = config().logConfig(LogConfig.logConfig().enablePrettyPrinting(false));
    }

    @After
    public void teardown() {
        RestAssured.reset();
    }

    @Test(priority = 0, enabled = true)
    public void logAll() {
        baseURI = ("http://openapi-test.savour.fun");
        RequestSpecification request = RestAssured.given();

        String app_uuid = "ICEOPERATIONTEST-HYZO-NHO2-DNKU-W9ZZLR7RUIFU";
        String token = "sLGZzb3r4FJHU327YKQ1";
        String corp_uuid = "gsc53f9713sf4e3791725a9tf786c8c9";
        long time = Instant.now().getEpochSecond();
        String timestamp = Long.toString(time);
        String signature = md5Hash.getMd5(app_uuid + time + token);

        JSONObject object = new JSONObject();
        object.put("app_uuid", app_uuid);
        object.put("token", token);
        object.put("corp_uuid", corp_uuid);
        object.put("timestamp", "1607914770");
        object.put("signature", "02cb091e1edeb12736a923cebf3d022c");
        request.log().all();
        request.contentType(ContentType.JSON).body(object.toString())
                .post("v1/authms/auth/app");



    }
//     @Test (priority = 0, enabled = true)
    public void post() {
        baseURI = ("http://openapi-test.savour.fun");


        String app_uuid = "ICEOPERATIONTEST-HYZO-NHO2-DNKU-W9ZZLR7RUIFU";
        String token = "sLGZzb3r4FJHU327YKQ1";
        String corp_uuid = "gsc53f9713sf4e3791725a9tf786c8c9";
        long time = Instant.now().getEpochSecond();
        String timestamp = Long.toString(time);
        String signature = md5Hash.getMd5(app_uuid + time + token);

        JSONObject object = new JSONObject();
        object.put("app_uuid", app_uuid);
        object.put("token", token);
        object.put("corp_uuid", corp_uuid);
        object.put("timestamp", "1607914770");
        object.put("signature", "02cb091e1edeb12736a923cebf3d022c");


        Response response = given().when().contentType(ContentType.JSON).body(object.toJSONString()).
                post("v1/authms/auth/app");

        response.then().log().all();
        out.println(response.asString());
    }

    @Test
    public void emailTest() throws MessagingException, IOException {

        // create a reader object on the properties file
        FileReader reader = new FileReader("db.properties");

        // create properties object
        Properties properties = new Properties();

        // Add a wrapper around reader object
        properties.load(reader);

        // access properties data
        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));
        properties.put("host.host", "host");



        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication("sangkt","Aa123456!");
            }
        });

        // Create object of MimeMessage class
        Message message = new MimeMessage(session);

        // Set the from address
        message.setFrom(new InternetAddress("mukeshotwani.50@gmail.com"));

        // Set the recipient address
        message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("mukesh.otwani50@gmail.com"));

        // Add the subject link
        message.setSubject("Testing Subject");

        // Create object to add multimedia type content
        BodyPart messageBodyPart1 = new MimeBodyPart();

        // Set the body of email
        messageBodyPart1.setText("This is message body");

        // Create another object to add another content
        MimeBodyPart messageBodyPart2 = new MimeBodyPart();

        // Mention the file which you want to send
        String filename = "G:\\a.xlsx";

        // Create data source and pass the filename
        DataSource source = (DataSource) new FileDataSource(filename);

        // set the handler
        messageBodyPart2.setDataHandler(new DataHandler((javax.activation.DataSource) source));

        // set the file
        messageBodyPart2.setFileName(filename);

        // Create object of MimeMultipart class
        Multipart multipart = new MimeMultipart();

        // add body part 1
        multipart.addBodyPart(messageBodyPart2);

        // add body part 2
        multipart.addBodyPart(messageBodyPart1);

        // set the content
        message.setContent(multipart);

        // finally send the email
        Transport.send(message);

        System.out.println("=====Email Sent=====");

    }
}
