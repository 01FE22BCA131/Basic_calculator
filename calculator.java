
class calculator{
    
    /**
     * The function "add" takes two float operands and returns their sum.
     * 
     * @param operand_1 The first operand to be added. It is of type float.
     * @param operand_2 The second operand that will be added to the first operand.
     * @return the sum of operand_1 and operand_2.
     */
    float add(float operand_1,float operand_2){
    return(operand_1 + operand_2);
    }

    /**
     * The function "sub" subtracts operand_2 from operand_1 and returns the result.
     * 
     * @param operand_1 The first operand for subtraction.
     * @param operand_2 The second operand in the subtraction operation.
     * @return the result of subtracting operand_2 from operand_1.
     */
    float sub(float operand_1,float operand_2){
    return(operand_1 - operand_2);
    }

    /**
     * The function "mul" takes two float operands and returns their product.
     * 
     * @param operand_1 The first operand of the multiplication operation. It is a floating-point
     * number.
     * @param operand_2 The second operand in the multiplication operation.
     * @return the product of operand_1 and operand_2.
     */
    float mul(float operand_1,float operand_2){
    return(operand_1 * operand_2);
    }

    /**
     * The function div takes two float operands and returns their division result.
     * 
     * @param operand_1 The first operand of the division operation.
     * @param operand_2 The second operand in the division operation.
     * @return the result of dividing operand_1 by operand_2.
     */
    float div(float operand_1,float operand_2){
    return(operand_1 / operand_2);
    }



/**
 * The main function creates an instance of the calculator class, performs addition, subtraction,
 * multiplication, and division operations on two operands, and prints the results.
 */
public static void main(String[] args){
    calculator calc=new calculator();
    float operand_1=10;
    float operand_2=5;
    float add_result = calc.add(operand_1,operand_2);
    System.out.println("Result:"+add_result);
    float sub_result = calc.add(operand_1,operand_2);
    System.out.println("Result:"+sub_result);
    float mul_result = calc.add(operand_1,operand_2);
    System.out.println("Result:"+mul_result);
    float div_result = calc.add(operand_1,operand_2);
    System.out.println("Result:"+div_result);

}
}