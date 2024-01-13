import xmlplain


def start():
    with open("input.xml", "r", encoding="utf-8") as input:
        root = xmlplain.xml_to_obj(input, strip_space=True, fold_dict=True)

    with open("output_libs_dop1.yaml", "w", encoding="utf-8") as output:
        xmlplain.obj_to_yaml(root, output)


start()

