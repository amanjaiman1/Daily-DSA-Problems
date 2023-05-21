The problem "Bus Conductor" requires finding the minimum number of moves needed to allocate chairs to passengers on a bus. The problem provides two arrays: chairs and passengers, each of length n. The chairs array represents the positions of n chairs on the bus, while the passengers array represents the initial positions of n passengers.

The objective is to assign each passenger to a chair while ensuring that no two passengers end up in the same chair. To achieve this, the following move can be performed any number of times:

Increase or decrease the position of a passenger by 1 (i.e., moving the passenger from position x to x + 1 or x - 1).
The task is to determine the minimum number of moves required to allocate chairs to all passengers while adhering to the above conditions.

It's important to note that initially, there may be multiple chairs or passengers occupying the same position.


...................................................................................................................................................

Approach - 

Sort both the chairs and passengers arrays in ascending order. This ensures that the positions are arranged in increasing order.

Initialize a variable, let's say moves, to keep track of the total number of moves required.

Iterate through each passenger and chair, starting from the first index (index 0) of both arrays.

For each passenger, calculate the absolute difference between the passenger's position and the chair's position.

Increment the moves variable by the calculated difference value.

After assigning a chair to a passenger, mark the chair as occupied to ensure that no other passenger is assigned to the same chair.

Continue this process until all passengers have been assigned a chair.

Finally, return the value of the moves variable as the minimum number of moves required to allocate chairs to passengers. 




................................................................................................................................................

Solution - 

public static int busConductor(int n, int[] chairs, int[] passengers) {
   Arrays.sort(chairs);
   Arrays.sort(passengers);

   int ans = 0;

   for (int i = 0; i < n; i++) {
      ans += Math.abs(chairs[i] - passengers[i]);
   }

   return ans;
}
