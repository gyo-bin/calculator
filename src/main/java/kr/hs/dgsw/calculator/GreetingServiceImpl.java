package kr.hs.dgsw.calculator;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{
    @Override
    public double plus(double num1, double num2) {
        return num1+num2;
    }

    @Override
    public double minu(double num1, double num2) {
        return num1-num2;
    }

    @Override
    public double mul(double num1, double num2) {
        return num1*num2;
    }

    @Override
    public double div(double num1, double num2) {
        return num1/num2;
    }
}
