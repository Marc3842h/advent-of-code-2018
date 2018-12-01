with open("input.txt", "r") as input_file:
    data = input_file.readlines()

data = [int(i.strip()) for i in data]
print(sum(data))
