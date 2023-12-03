def reverse_number(n):
    if n < 10:
        return n
    
    last_digit = n % 10
    remaining_number = n // 10
    reversed_remaining = reverse_number(remaining_number)
    reversed_number = int(str(last_digit) + str(reversed_remaining))
    
    return reversed_number
