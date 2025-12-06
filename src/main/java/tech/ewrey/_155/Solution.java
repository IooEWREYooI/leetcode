package tech.ewrey._155;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin()); // return -2
    }

    /**
     * Создайте стек, который поддерживает push, pop, top и получение минимального элемента за постоянное время.
     *
     * Реализуйте класс MinStack:
     * <р>
     * MinStack() инициализирует объект стека.
     * void push(int val) помещает элемент val в стек.
     * void pop() удаляет элемент с вершины стека.
     * int top() получает верхний элемент стека.
     * int getMin() извлекает минимальный элемент в стеке.
     * Вы должны реализовать решение с временной сложностью O(1) для каждой функции.
     * </p>
     * <р>
     * Ваш объект MinStack будет создан и вызван следующим образом:
     * MinStack obj = новый MinStack();
     * obj.push(val);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     * </p>
     */
    static class MinStack {

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> min_vals = new Stack<>();

        public void push(int val) {
            if (min_vals.isEmpty() || val <= min_vals.peek()) {
                min_vals.push(val);
            }
            stack.push(val);
        }

        public void pop() {
            if (stack.peek().equals(min_vals.peek())) {
                min_vals.pop();
            }
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return min_vals.peek();
        }
    }

}
