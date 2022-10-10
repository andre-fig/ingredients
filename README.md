# Ingredients

## Examples:

### Order without extras or restrictions

* input: Classic
* output: banana,honey,mango,peach,pineapple,strawberry

### Restriction present in the smoothie

* input: Classic,-strawberry
* output: banana,honey,mango,peach,pineapple

### Constraint missing in smoothie

* input: Classic,-passion fruit
* output: banana,honey,mango,peach,pineapple,strawberry

## Non-existing smoothie

* input: Gourmet
* output: IllegalArgumentException

### Additional out of stock

* input: Classic,passion fruit
* output: IllegalArgumentException
