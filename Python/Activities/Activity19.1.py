# Import pandas
import pandas as pd

# Create a dictionary that will be used to create the DataFrame
data = {
    'FirstName':["Satvik", "Avinash", "Lahri"],
    'LastName':["Shah", "Kati", "Rath"],
    'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
    'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

# Create the DataFrame that will be written to the excel file
dataframe = pd.DataFrame(data)

# Print the dataframe
print(dataframe)

# Write the dataframe to a Excel file
with pd.ExcelWriter('sample.xlsx') as writer:
    dataframe.to_excel(writer, 'Sheet1', index=False)

# No need to call writer.save() explicitly; it's handled by the with block
