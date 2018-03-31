# My Android Template

Androidでプロジェクトを作る際の下地。

## Layout

- [x] dimens
- [x] color
- [x] theme

## Style Guide

### layout

#### 命名規則

##### layout

`resource id` は `[layout] or [view]_[わかりやすい名前]`

example
```xml
<ImageView
    android:id="@+id/image_header_thumbnail"
    ...
```

#### color

Select base color from [Material Design_Guide](https://material.io/guidelines/style/color.html)

[colors.xml](https://github.com/Jung0/android-template/blob/master/app/src/main/res/values/colors.xml)

If OriginalColor exists, write it as `[Color] _ [Number]`

#### dimens

[dimen_base.xml](https://github.com/Jung0/android-template/blob/master/app/src/main/res/values/dimens_base.xml)


Please use [dimens.xml](https://github.com/Jung0/android-template/blob/master/app/src/main/res/values/dimens.xml) to set for each layout file

## Architecture

I am currently thinking of inserting an architecture 🤔

## commit message template

[.commit_template](https://gist.github.com/Jung0/56d527ed5d2c783661f7d56c46332308)

clone or download to your favorite directory

```shell
git clone https://gist.github.com/Jung0/56d527ed5d2c783661f7d56c46332308

git config commit.template downloaddir/.commit_template
```

## 以下のライブラリを使うプロジェクトを前提としています

* kotlin
* dokka
* timber
* glide
* retrofit
* OkHttp3
* moshi
* RxJava2
* ktlint
* ktx

### version管理

[version gradle](https://github.com/Jung0/android-template/blob/master/versions.gradle)
