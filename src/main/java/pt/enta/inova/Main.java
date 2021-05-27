/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.enta.inova;

import static spark.Spark.get;
import spark.servlet.SparkApplication;

/**
 *
 * @author enta
 */
public class Main implements SparkApplication {

    @Override
    public void init() {
        get("/", "application/json", (request, response) -> {
            response.status(200);
            return "{\"message\":\"Valid endpoints are: disciplinas, cursos, curdis e formandos.\"}";
        });
        get("/disciplinas", "application/json", (request, response) -> {
            response.status(200);
            return "{\"message\":\"As disciplinas serão apresentadas aqui.\"}";
        });
    }

    @Override
    public void destroy() {
        SparkApplication.super.destroy(); //To change body of generated methods, choose Tools | Templates.
    }

}
