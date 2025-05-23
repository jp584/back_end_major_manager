package grado.ucb.edu.back_end_grado.util;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class Globals {
    public static final String apiVersion = "api/v1/";

    public static final String reCaptchaSiteSecret = "6LchpbIpAAAAALil_-76o5mL_8nklA0tuSZZrvMa";

    public static final String[] httpOkStatus = HttpStatus.OK.toString().split(" "); // Status 200

    public static final String[] httpSuccessfulCreatedStatus = HttpStatus.CREATED.toString().split(" "); // Status 201
    public static final String[] httpBadRequest = HttpStatus.BAD_REQUEST.toString().split(" "); /// Status 400
    public static final String[] httpNotFoundStatus = HttpStatus.NOT_FOUND.toString().split(" "); // Status 404

    public static final String[] httpMethodNowAllowed = HttpStatus.METHOD_NOT_ALLOWED.toString().split(" "); // Status 405
    public static final String[] httpInternalServerErrorStatus = HttpStatus.INTERNAL_SERVER_ERROR.toString().split(" "); // Status 500

}
