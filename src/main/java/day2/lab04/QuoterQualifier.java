package day2.lab04;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by administrator on 07.04.15.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface QuoterQualifier {
    QuoterType value();
}
