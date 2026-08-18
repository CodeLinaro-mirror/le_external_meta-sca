SUMMARY = "The Real First Universal Charset Detector"
HOMEPAGE = "https://github.com/ousret/charset_normalizer"

DEPENDS += "python3-setuptools-scm-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=48178f3fc1374ad7e830412f812bde05"

PYPI_PACKAGE = "charset-normalizer"

SRC_URI[sha256sum] = "6117b84ea48435e5356dc737f5121485c30920ba43375fa7b434fd753df0eac3"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native

do_configure:prepend() {
    # remove the upper setuptools limit
    # as this is an ever moving target
    sed -i "s#,<=[0-9][0-9].[0-9].[0-9]##" ${S}/pyproject.toml
    sed -i "s#,<[0-9][0-9].[0-9].[0-9]##" ${S}/pyproject.toml
    sed -i 's#,<[0-9][0-9].[0-9]"]#"]#' ${S}/pyproject.toml
}
