class operation{
    /**
     * The function "square" takes a float number as input and returns the square of that number.
     * 
     * @param operand_1 A float number that represents the operand for which we want to calculate the
     * square.
     * @return the square of the operand_1.
     */
    float square(float operand_1){
        return (operand_1*operand_1);
    }

    /**
     * The function "cube" takes a float number as input and returns the cube of that number.
     * 
     * @param operand_1 The parameter "operand_1" is a float value that represents the number that we
     * want to calculate the cube of.
     * @return The cube of the operand_1 value.
     */
    float cube(float operand_1){
        return (operand_1*operand_1*operand_1);
    }
    /**
     * The function calculates the modulus of two floating-point numbers.
     * 
     * @param operand_1 The first operand, which is a floating-point number.
     * @param operand_2 The second operand in the mod function.
     * @return the remainder of dividing operand_1 by operand_2.
     */
    float mod(float operand_1, float operand_2){
        return (operand_1%operand_2);
    }
}