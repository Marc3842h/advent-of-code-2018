import itertools

with open("input.txt", "r") as input_file:
    data = input_file.readlines()

data = [int(i.strip()) for i in data]
seen = set([0])
frequency = 0

for i in itertools.cycle(data):
	frequency += i

	if frequency in seen:
		print(frequency)
		break

	seen.add(frequency)
