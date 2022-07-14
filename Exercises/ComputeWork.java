package Exercises;


public class ComputeWork
{
    String prompt;
    int hours;
    int rate;
    double total;
}

public ComputeWork(String prompt, int hours, int rate, double total)
{
    this.prompt = prompt;
    this.hours = hours;
    this.rate = rate;
    this.total = total;
}

// Method 1
public void getInput() 
{
    return prompt;
}

// Method 2 
public void setTotal(int hours, int rate)
{
    if (hours > 40)
    {
        total = (40 * rate) + (hours - 40) * rate * 1.5;
    }
    else if (hours < 40)
    {
        total = hours * rate;
    }

}



// Main Method
public static void main(String[] args) 
{
    
}