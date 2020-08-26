package com.softwood

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.micronaut.security.annotation.Secured
import io.micronaut.security.rules.SecurityRule

/**
 * with security enabled default is to return 401.
 *
 * you must be explicit about the policy you want to apply
 * https://micronaut-projects.github.io/micronaut-security/latest/guide/
 * here we have se anonymous to whole class - which then permits access freely
 *
 */
@Controller("/hello")
@Secured(SecurityRule.IS_ANONYMOUS)
public class HelloController {
    @Get
    @Produces(MediaType.TEXT_PLAIN)
    public String index() {
        return "Hello World"
    }
}