import seaborn as sns
import pandas as pd
import matplotlib.pyplot as plt
print(sns.get_dataset_names())
penguins=sns.load_dataset('penguins')
a=penguins['species'].value_counts()
print(a)
