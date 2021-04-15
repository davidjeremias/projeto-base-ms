package com.u2d.projeto.util;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.Arrays;
import java.util.Map;

public class RequestUtil {

    private static final String SEPARADOR = "/";

    public static String extrairParametro(Map<String, String[]> params, String nomeParametro) {
        return params.get(nomeParametro) != null ? params.get(nomeParametro)[0] : null;
    }

    public static Integer extrairParametroInteiro(Map<String, String[]> params, String inteiro) {
        return params.get(inteiro) != null ? Integer.parseInt(params.get(inteiro)[0])  : null;
    }

    public static String[] extrairParametros(Map<String, String[]> params, String nomeParametro) {
        return params.get(nomeParametro) != null ? params.get(nomeParametro) : null;
    }

    public static String montaPathRequisicao(String... parametros) {
        StringBuilder sb = new StringBuilder();
        for(String p : parametros) {
            sb = sb.append(p).append(SEPARADOR);
        }
        return sb.toString();
    }

    public static HttpHeaders createHeadersMediaTypeAndCharset() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(MediaType.parseMediaTypes(MediaType.APPLICATION_JSON_VALUE));
        headers.setContentType(MediaType.parseMediaType(MediaType.APPLICATION_JSON_VALUE));
        return headers;
    }
}
